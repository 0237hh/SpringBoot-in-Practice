package com.manning.sbip.ch04.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReleaseItem {
    private String itemId;
    private String itemDescription;
}
