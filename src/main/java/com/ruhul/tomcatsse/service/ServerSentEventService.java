package com.ruhul.tomcatsse.service;

import com.ruhul.tomcatsse.common.EventDto;
import reactor.core.publisher.Flux;

public interface ServerSentEventService {
	Flux<EventDto> onPingSubscribe();

	Flux<String> getFile();
}
