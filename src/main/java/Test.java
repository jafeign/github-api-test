import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

/**
 * @From: Jeffrey
 * @Date: 2024/4/17
 */
public class Test {
    public static void main(String[] args) throws Exception{
        GitHub github = new GitHubBuilder().withOAuthToken("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").build();
        System.out.println(github.getApiUrl());
    }
}
