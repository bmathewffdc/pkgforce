/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */
package com.nawforce.runtime.parsers.antlr

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("antlr4ts/tree/AbstractParseTreeVisitor", "AbstractParseTreeVisitor")
class AbstractParseTreeVisitor[Result] extends js.Object {
  def visit(tree: ParseTree): Result = js.native

  def visitChildren(node: RuleNode): Result                                          = js.native
  def visitTerminal(node: TerminalNode): Result                                      = js.native
  def visitErrorNode(node: ErrorNode): Result                                        = js.native
  protected def defaultResult(): Result                                              = js.native
  protected def aggregateResult(aggregate: Result, nextResult: Result): Result       = js.native
  protected def shouldVisitNextChild(node: RuleNode, currentResult: Result): Boolean = js.native
}
