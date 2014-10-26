package com.kylemoore

uses java.lang.Integer

class Pawn {

  private var _x : int = 0;

  construct() {
    print("No-arg constructor")
  }

  construct(x : int) {
    print("Single-arg constructor")
    _x = x
  }

  function dump() {
    print(_x)
  }

  function advance(steps : int) : int {
    _x += steps
    return _x
  }

}