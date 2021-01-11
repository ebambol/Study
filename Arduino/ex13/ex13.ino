void setup() {
  pinMode(13, OUTPUT);  //LED 연결 (디지털 출력)
  pinMode(2, INPUT);  //버튼 연결 (디지털 입력)
}

void loop() {
  int value = digitalRead(2); //버튼 확인

  if(value == HIGH) {
//    digitalWrite(13, LOW);
    digitalWrite(13, HIGH);
  } else {
//    digitalWrite(13, HIGH);
    digitalWrite(13, LOW);
  }
}
