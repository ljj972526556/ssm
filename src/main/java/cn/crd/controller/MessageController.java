package cn.crd.controller;


import cn.crd.common.Result;
import cn.crd.entity.Message;
import cn.crd.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/messages")
public class MessageController {
    @Autowired
    private MessageService service;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Message findMessage(@PathVariable int id){
        Message message = service.findMessageById(id);
        return message;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Result insertMessage(@RequestBody Message message){
        Result result = service.insertMessage(message);
        return result;
    }
}
