void setup() {
 pinMode(LED_BUILTIN, OUTPUT);
 // 디지털 13번핀을 디지털신호 출력용
  digitalWrite(13, HIGH); // 5V
  delay(5000); // 5초
  digitalWrite(13, LOW); // 0V
  delay(1000); // 1초
}

void loop() {
  digitalWrite(13, HIGH); // 5V
  delay(50); // 0.05초
  digitalWrite(13, LOW); // 0V
  delay(50); // 0.05초
}
