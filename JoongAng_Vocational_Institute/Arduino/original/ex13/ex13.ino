void setup() {
 pinMode(13, OUTPUT); // LED 연결 (디지털 신호 출력)
 pinMode(2, INPUT); // 버튼 연결 (디지털 신호 입력)
}
void loop() {
  int value = digitalRead(2);
  if(value == HIGH) { // 버튼을 눌렀을 때
    digitalWrite(13, HIGH);
  } else { // 버튼을 누르지 않았을 때
    digitalWrite(13, LOW);
  }
}
