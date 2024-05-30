package io.qifan.ai.dashscope;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.ai.embedding.EmbeddingOptions;

@Data
@Accessors(chain = true)
public class DashScopeAiEmbeddingOptions implements EmbeddingOptions {
    private String model;
}
