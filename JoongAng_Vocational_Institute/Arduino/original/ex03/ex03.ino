void setup() {
 pinMode(13, OUTPUT); // LED_BUILTIN == 13
 pinMode(6,OUTPUT);
 // 디지털 13, 6 번핀을 디지털신호 출력용
  digitalWrite(13, HIGH); // 5V 전류가 흐른다.
  digitalWrite(6, HIGH); // 5V 전류가 흐른다.
  delay(5000); // 5초
  digitalWrite(13, LOW); // 0V 전류가 흐르지 않는다.
  digitalWrite(6, LOW); // 0V 전류가 흐르지 않는다.
  delay(1000); // 1초
}
void loop() {
  digitalWrite(13, HIGH);// 5V 빨간색 LED 켬
  digitalWrite(6, LOW);  // 초록색 LED 끔
  delay(500); // 0.5초
  digitalWrite(13, LOW);
  digitalWrite(6, HIGH); // 0V
  delay(500); // 0.5초
}
