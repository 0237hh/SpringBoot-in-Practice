package com.manning.sbip.ch04.endpoint;

import com.manning.sbip.ch04.model.ReleaseNote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.util.Collection;

@Component
@Endpoint(id = "releaseNotes")
public class ReleaseNotesEndPoint {
    private final Collection<ReleaseNote> releaseNotes;

    @Autowired
    public ReleaseNotesEndPoint(Collection <ReleaseNote> releaseNotes)  {
        this.releaseNotes =releaseNotes;
    }

    @ReadOperation
    public Iterable<ReleaseNote> releaseNotes() {
        return releaseNotes;
    }
}
