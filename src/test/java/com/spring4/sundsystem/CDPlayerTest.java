package com.spring4.sundsystem;

import com.spring4.soundsystem.CDPlayerConfig;
import com.spring4.soundsystem.CompactDisc;
import com.spring4.soundsystem.MediaPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final SystemOutRule log=new SystemOutRule().enableLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void cdShouldNotBeNull(){
        compactDisc.play();
        assertNotNull(compactDisc);
    }

    @Test
    public void play(){
        player.play();
        assertEquals("Playing Sgt. Pepper`s Lonely Hearts Club Band"+
                " by The Beatles\n",log.getLog());
    }
    @Test
    public void writesTextToSystemOut() {
        System.out.print("hello world");
        assertEquals("hello world", log.getLog());
    }
}
