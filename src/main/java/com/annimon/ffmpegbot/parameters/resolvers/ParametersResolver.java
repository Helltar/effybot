package com.annimon.ffmpegbot.parameters.resolvers;

import com.annimon.ffmpegbot.parameters.Parameters;
import com.annimon.ffmpegbot.session.FileInfo;
import org.jetbrains.annotations.NotNull;

public interface ParametersResolver {

    void resolve(@NotNull Parameters parameters, @NotNull FileInfo fileInfo);

    /**
     * Refines all parameters based on user input.
     * <p>
     * Example: if Disable audio is ON -> removes all audio parameters.
     *
     * @param parameters all parameters
     */
    default void refine(@NotNull Parameters parameters) {

    }
}
