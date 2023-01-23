package com.orlov.springboot.university.springboot_university.controller;

import com.orlov.springboot.university.springboot_university.dto.AddGroupRequestDto;
import com.orlov.springboot.university.springboot_university.dto.AllGroupIdResponseDto;
import com.orlov.springboot.university.springboot_university.dto.AllGroupResponseDto;
import com.orlov.springboot.university.springboot_university.dto.OneGroupResponseDto;
import com.orlov.springboot.university.springboot_university.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {

    @Autowired
    private GroupService groupService;      // здесть интерфейс, потому что проще тестировать: можно созать mock-class, который будет использовать интерфейс и его тестировать

    @PostMapping
    public void addGroup(@RequestBody AddGroupRequestDto addGroupRequestDto){     //Dto используется для настройки принятия только нужных полей из JSON
    groupService.addGroup (addGroupRequestDto);
    }

    @GetMapping
    public List<AllGroupResponseDto> getAllGroups(){     //Dto используется для настройки принятия только нужных полей из JSON
        return groupService.getAllGroups ();
    }

    @GetMapping("/groupIds")
    public List<AllGroupIdResponseDto> getAllGroupIds(){
        return groupService.findAllGroupsIds ();
    }

    @GetMapping("/{id}")
    public OneGroupResponseDto getGroupById(@PathVariable Integer id){
        return groupService.getGroupById (id);
    }
}
