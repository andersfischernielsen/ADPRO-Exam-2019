/************************************************************************
  Final Exam: Advanced Programming (Master-Level, MSc-Level)
  IT University of Copenhagen, Autumn 2018: 9 January 9:00
  Andrzej Wąsowski
 ************************************************************************

  Your Full Name: ___
  Your ITU email account: ___

  The exam consists of 10 tasks to  be solved within 4 hours.  MSc and
  Master students  (so all  registered) solve the  same exam,  all the
  tasks.   You  can  use  any  function  from  the  course  (textbook,
  exercises) in the solutions, as  well as standard library functions,
  unless stated otherwise in the question.  You can access any written
  or electronic  materials, also  online, but you  are not  allowed to
  communicate with anybody during the exam.

  By  submitting,  you declare  to  have  solved the  problems  alone,
  without communicating with anybody.



  SUBMISSION

  Solve the tasks in the file 'exam2018autumn.scala' (this file) found
  in the zip archive made available on LearnIt.

  Fill in your name and your ITU email above, in the top of the file.

  Submit this file  and only this file to learnIT.   Do not convert it
  to  any other  format than  .scala.  Do  not submit  the entire  zip
  archive. Do  not reorder  the answers,  and do  not remove  question
  numbers from the  file.  When free text answers  are expected, write
  them as comments.

  The only accepted file format is '.scala'.

  The  answers  will   be  graded  manually. We  will   focus  on  the
  correctness of ideas and the use  of the course concepts. We will be
  permissive on  minor issues  such as semicolons,  other punctuation,
  small deviations  in function  names, switching between  curried and
  uncurried  parameters, etc.   We  will not  check  whether the  type
  inference  succeeds. It suffices  that  a human  reader could  infer
  types.



  REMARKS

  Each  task has  some introduction  text. The part  that needs  to be
  solved is marked with the letter 'Q'.

  We do not recommend solving questions to the point when they compile
  and pass tests.  Dependency problems  and other technical issues can
  take a lot of time, so only do this, once you are done with drafting
  all answers.

  Nevertheless, if  you do compile,  you can use the  'build.sbt' file
  provided  in the  zip  archive linked  above. It  has the  necessary
  library dependencies  configured. The file also contains  the course
  libraries that the solutions depend on.

  Some values are made lazy  to prevent your executions failing before
  all exercises are  solved.  This is to help you  running in the REPL,
  or  testing otherwise.   Otherwise  these lazy  annotations have  no
  additional meaning.

  If possible, please keep the  code and comments wrapped at something
  like 80-120 columns. This helps grading a lot. For instance, observe
  the width of the original file.

  Good luck!

*************************************************************************/

package adpro

import fpinscala.monoids.Monoid
import fpinscala.monads.Monad
import fpinscala.monads.Functor
import fpinscala.laziness.{Stream,Empty,Cons}
import fpinscala.laziness.Stream._
import fpinscala.parallelism._
import fpinscala.parallelism.Par._
import scala.language.higherKinds
import adpro.data._
import adpro.data.FingerTree._
import monocle.Lens

import org.scalatest.FreeSpec
import org.scalatest.Matchers._
import org.scalatest.prop.Checkers
import org.scalacheck._
import org.scalacheck.Prop._
import Arbitrary.arbitrary
import Gen._

object Exam2018Autumn {


}


