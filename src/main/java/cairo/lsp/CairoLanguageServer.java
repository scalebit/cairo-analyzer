package cairo.lsp;

import org.eclipse.lsp4j.CompletionParams;
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest;
import org.eclipse.lsp4j.services.LanguageServer;
import java.util.concurrent.CompletableFuture;

public interface CairoLanguageServer extends LanguageServer {
    @JsonRequest("vfs/provide")
    CompletableFuture<CompletionResponse> provideTextDocumentContent(CompletionParams params);
}

