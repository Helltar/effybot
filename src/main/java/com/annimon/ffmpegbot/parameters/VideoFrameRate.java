package com.annimon.ffmpegbot.parameters;

import com.annimon.ffmpegbot.commands.ffmpeg.Visitor;

import java.util.List;

public class VideoFrameRate extends StringParameter {
    private static final List<String> VALUES = List.of(
            "5", "10", "15", "20", "25", "", "30", "45", "60"
    );

    public VideoFrameRate() {
        super("vfr", "Frame rate",  VALUES, "");
    }

    @Override
    public String describeValue(String value) {
        if (value.isEmpty()) {
            return "ORIGINAL";
        } else {
            return super.describeValue(value);
        }
    }

    @Override
    public <I> void accept(Visitor<I> visitor, I input) {
        visitor.visit(this, input);
    }
}
