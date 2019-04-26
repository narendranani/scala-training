package practice.basics

object CaseClasses {

  def init: Unit = {
    println(s"CaseClasses: ${showNotification(someSms)} ") // prints You got an SMS from 12345! Message: Are you there?
    println(s"CaseClasses: ${showNotification(someVoiceRecording)} ")
    println(s"CaseClasses: ${showNotification(someEmail)} ")
  }

  //    Case Class
  abstract class Notification

  //Max parameters size is 22
  case class Email(email: Any, title: Any, body: Any) extends Notification

  case class SMS(caller: String, message: String) extends Notification

  case class VoiceRecording(contactName: String, link: String) extends Notification

  def showNotification(notification: Notification): String = {
    notification match {
      case Email(email, title, _) =>
        s"You got an email from $email with title: $title"
      case SMS(number, message) =>
        s"You got an SMS from $number! Message: $message"
      case VoiceRecording(name, link) =>
        s"you received a Voice Recording from $name! Click the link to hear it: $link"
    }
  }

  val someSms = SMS("12345", "Are you there?")
  val someEmail = Email("abc@gmai.com", "Attend the scala session", "")
  val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")

  //  It turns out that case classes are just a special case of classes, whose purpose is to aggregate several values into a single value

  class BankAccount {
    private var balance = 0
    def deposit(amount: Int): Unit = {
      if (amount > 0) balance = balance + amount
    }

    def withdraw(amount: Int): Int =
      if (0 < amount && amount <= balance) {
        balance = balance - amount
        balance
      } else throw new Error("insufficient funds")
  }

  case class Note(name: String, duration: String, octave: Int)
  val aliceAccount = new BankAccount
  val bobAccount = new BankAccount
  println(aliceAccount == bobAccount)
  val c3 = Note("C", "Quarter", 3)
  val cThree = Note("C", "Quarter", 3)

  println(c3 == cThree)


}
