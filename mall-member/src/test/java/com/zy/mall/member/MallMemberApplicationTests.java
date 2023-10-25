package com.zy.mall.member;

import com.zy.mall.member.entity.MemberLoginLogEntity;
import com.zy.mall.member.service.MemberLoginLogService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class MallMemberApplicationTests {

    @Autowired
    private MemberLoginLogService memberLoginLogService;

    @Test
    void contextLoads() {

        MemberLoginLogEntity memberLoginLogEntity = new MemberLoginLogEntity();
        memberLoginLogEntity.setId(1L);
        memberLoginLogEntity.setMemberId(1L);
        memberLoginLogEntity.setLoginType(1);
        memberLoginLogEntity.setIp("192.168.0.1");
        memberLoginLogEntity.setCity("深圳市");
        memberLoginLogEntity.setCreateTime(new Date());
        memberLoginLogService.save(memberLoginLogEntity);

        List<MemberLoginLogEntity> list = memberLoginLogService.list();
        System.out.println(list);

    }

}
