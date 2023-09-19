/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 REKTBuildr
 *
 * For more information, visit:
 * https://crypto.bi
 *
 *
 **/

package to.avax.avalanche.utils.errors;

public class MergeRuleError extends AvalancheError {
    public MergeRuleError(String m) {
        super(m, MERGE_RULE_ERROR_CODE);
    }
}
