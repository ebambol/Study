//2020-12-29 이현국
byte arr1[] = {8,9,11,12,13}; //{보행자 초록, 보행자 빨강, 신호등 초록, 신호등 노랑, 신호등 빨강}
int off = 100;  //LED 꺼질때 지연시간

void setup() {
  for(int i=0; i<5; i++){
    pinMode(arr1[i],OUTPUT);
    digitalWrite(arr1[i],HIGH);
  }
  delay(3000);  //모든 LED 3초 켜짐

  for(int i=0; i<5; i++){
    digitalWrite(arr1[i],LOW);
  }
  delay(500); //모든 LED 꺼짐
}

void loop() {
  //신호등 초록(3초), 보행자 빨강(4초) 켜지고 꺼짐
  digitalWrite(11,HIGH);
  digitalWrite(9,HIGH);
  delay(3000);

  //신호등 초록 꺼짐, 신호등 노랑 1초 켜짐
  digitalWrite(11,LOW);
  digitalWrite(12,HIGH);
  delay(1000);

  //보행자 빨강 꺼짐, 신호등 노랑 꺼짐
  digitalWrite(9,LOW);
  digitalWrite(12,LOW);
  delay(off);
  
  //신호등 빨강, 보행자 초록 5초 켜짐
  digitalWrite(13,HIGH);
  digitalWrite(8,HIGH);
  delay(5000);  
  
  //신호등 빨강, 보행자 초록 꺼짐
  digitalWrite(13,LOW);
  digitalWrite(8,LOW);
  delay(off);
}
