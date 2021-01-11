void setup() {
  pinMode(13,OUTPUT); //빨강
  pinMode(12,OUTPUT); //노랑
  pinMode(11,OUTPUT); //초록

  digitalWrite(13,HIGH);
  digitalWrite(12,HIGH);
  digitalWrite(11,HIGH);
  delay(5000);
  digitalWrite(13,LOW);
  digitalWrite(12,LOW);
  digitalWrite(11,LOW);
  delay(100);
}

void loop() {
  //빨강 5초 켜기 = > 빨강 꺼짐 = > (노랑 0.5초 켜기 => 노랑 0.5꺼짐)x5 => 초록 1초 켜기
  digitalWrite(13,HIGH);
  delay(5000);
  digitalWrite(13,LOW);

  for(int i=0; i<5; i++){
    digitalWrite(12,HIGH);
    delay(500);
    digitalWrite(12,LOW);
    delay(500);
  }
  
  digitalWrite(11,HIGH);
  delay(5000);
  digitalWrite(11,LOW);

}
