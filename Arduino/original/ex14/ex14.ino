void setup() {
 Serial.begin(9600); 
 pinMode(13, OUTPUT); // LED 연결 (디지털 신호 출력)
 pinMode(12, OUTPUT);
 pinMode(11, OUTPUT);
 pinMode(2, INPUT); // 버튼 연결 (디지털 신호 입력)
}
void loop() {
  int value = digitalRead(2); // 0:LOW, 1:HIGH
  Serial.println(value); // 아두이노 -> 컴퓨터
  if(value == HIGH) { // 버튼을 눌렀을 때
    digitalWrite(13, HIGH); // LED 켜기
    digitalWrite(12, HIGH);
    digitalWrite(11, HIGH);
  } else { // 버튼을 누르지 않았을 때
    digitalWrite(13, LOW);  // LED 끄기
    digitalWrite(12, LOW);
    digitalWrite(11, LOW);
  }
}
