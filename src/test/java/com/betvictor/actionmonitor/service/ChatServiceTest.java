package com.betvictor.actionmonitor.service;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.betvictor.actionmonitor.model.Message;
import com.betvictor.actionmonitor.repository.MessageRepo;
import com.betvictor.actionmonitor.service.impl.ChatServiceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ChatServiceTest {

    @InjectMocks
    ChatServiceImpl service;

    @Mock
    MessageRepo repoMock;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldProcessMessage() {
        Message message = new Message();

        when(repoMock.save(message)).thenReturn(null);

        service.persist(message);

        verify(repoMock, times(1)).save(message);
    }

}