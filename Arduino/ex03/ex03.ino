void setup() {
  pinMode(13, OUTPUT);  //디지털 13번 핀을 디지털 신호로 출력
  pinMode(6, OUTPUT);

  //디지털 13, 6번 핀을 디지털신호 출력
  digitalWrite(13, HIGH); //5V RED LED ON
  digitalWrite(6, HIGH); //5V GREEN LED ON
  delay(5000);
  
  digitalWrite(13, LOW);  //0V RED LED OFF
  digitalWrite(6, LOW);  //0V GREEN LED OFF
  delay(1000);

}

void loop() {
  digitalWrite(13, HIGH); //5V RED LED ON
  digitalWrite(6, LOW);  //0V GREEN LED OFF
  delay(500);            //0.5s

  digitalWrite(13, LOW);  //0V RED LED OFF
  digitalWrite(6, HIGH); //5V GREEN LED ON
  delay(500);            //0.5s

}
