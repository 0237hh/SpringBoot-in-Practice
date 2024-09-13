package com.manning.sbip.ch04.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Builder
@Getter
@Setter
public class ReleaseNote {
    private String version;
    private LocalDateTime releaseDate;
    private String commitTag;
    private Set<ReleaseItem> newReleases;
    private Set<ReleaseItem> bugFixes;
}
