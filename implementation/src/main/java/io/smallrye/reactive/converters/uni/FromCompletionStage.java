package io.smallrye.reactive.converters.uni;

import java.util.concurrent.CompletionStage;

import io.smallrye.reactive.Uni;
import io.smallrye.reactive.converters.UniConverter;

public class FromCompletionStage<T> implements UniConverter<CompletionStage<T>, T> {

    public static final FromCompletionStage INSTANCE = new FromCompletionStage();

    private FromCompletionStage() {
        // Avoid direct instantiation
    }

    @Override
    public Uni<T> from(CompletionStage<T> instance) {
        return Uni.createFrom().completionStage(instance);
    }
}