package com.kylemoore

enhancement PawnEnhancement : Pawn {

  function squareIt() : int {
    return this.advance(0) * this.advance(0)
  }

}
