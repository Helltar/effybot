package com.annimon.ffmpegbot.parameters;

import com.annimon.ffmpegbot.commands.ffmpeg.Visitor;
import java.util.List;

public class Contrast extends StringParameter {
    public static final String ID = "contrast";
    private static final List<String> VALUES = List.of(
            "0.4", "0.6", "0.8",
            "1", "1.2", "1.4", "1.6",
            "1.8", "2"
    );

    public Contrast() {
        super(ID, "Contrast", VALUES, "1");
    }

    @Override
    public int defaultColumnsCount() {
        return 3;
    }

    @Override
    public <I> void accept(Visitor<I> visitor, I input) {
        visitor.visit(this, input);
    }
}
