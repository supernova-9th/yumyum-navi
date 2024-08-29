package com.yamyamnavi.domain.city;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class City {
    private String city;
    private List<Sgg> sgg;
}