package org.thehecklers.quote;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Created by markheckler on 12/13/15.
 */
@NoArgsConstructor
@RequiredArgsConstructor
public @Data class QuoteSource {
    private Integer id;
    @NonNull
    private String name;
    @NonNull
    private String description;
}
