package com.github.mauricioaniche.codesheriff.expectations;

import com.github.mauricioaniche.ck.CKClassResult;
import com.github.mauricioaniche.codesheriff.runner.SheriffReport;

public interface ClassExpectation {
    void match(CKClassResult clazz, SheriffReport report);
}
