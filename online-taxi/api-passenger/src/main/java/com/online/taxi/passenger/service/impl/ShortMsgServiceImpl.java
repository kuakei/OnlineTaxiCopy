package com.online.taxi.passenger.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.online.taxi.common.dto.sms.SmsSendRequest;
import com.online.taxi.common.dto.sms.SmsTemplateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.taxi.common.dto.ResponseResult;
import com.online.taxi.passenger.feign.SmsClient;
import com.online.taxi.passenger.service.ShortMsgService;

import net.sf.json.JSONObject;

/**
 * @author oi
 */
@Service
public class ShortMsgServiceImpl implements ShortMsgService {
	
	@Autowired
	private SmsClient smsClient;
	
	@Override
//    @Transactional(rollbackFor = Exception.class)
	public ResponseResult send(String phoneNumber, String code) {
		System.out.println("手机号和验证码："+phoneNumber+","+code);
		String serviceName = "SERVICE-SMS";
		String url = "http://"+serviceName+"/send/alisms-template";
		SmsSendRequest smsSendRequest = new SmsSendRequest();
		String[] phoneNumbers = new String[] {phoneNumber};
		smsSendRequest.setReceivers(phoneNumbers);
		
		List<SmsTemplateDto> data = new ArrayList<SmsTemplateDto>();
		SmsTemplateDto dto = new SmsTemplateDto();
		dto.setId("SMS_144145499");
		int templateSize = 1;
		HashMap<String, Object> templateMap = new HashMap<String, Object>(templateSize);
		templateMap.put("code", code);
		dto.setTemplateMap(templateMap);
		data.add(dto);
		
		smsSendRequest.setData(data);
		
		//feign调用
        ResponseResult result = null;
        try {
            result = smsClient.sendSms(smsSendRequest);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("feign 异常");
        }

        System.out.println("调用短信服务返回的结果"+JSONObject.fromObject(result));
		return result;
	}

}
