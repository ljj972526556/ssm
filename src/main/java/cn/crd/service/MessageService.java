package cn.crd.service;

import cn.crd.common.Result;
import cn.crd.dao.MessageMapper;
import cn.crd.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService{

    @Autowired
    private MessageMapper mapper;

    public Message findMessageById(int id){
        Message message = mapper.selectByPrimaryKey(id);
        return message;

    }

    public Result insertMessage(Message message) {
        mapper.insertSelective(message);
        return Result.ok();
    }
}
