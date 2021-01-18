void setup() {
  Serial.begin(9600);
  randomSeed(analogRead(0));  //중복없는 난수값 발생
  pinMode(2,INPUT);

  //2번 제어
  pinMode(11,OUTPUT); //초록
  pinMode(12,OUTPUT); //노랑
  pinMode(13,OUTPUT); //빨강
  
  //3번 3초동안 LED 켜지고 꺼짐
  digitalWrite(11,HIGH);
  digitalWrite(12,HIGH);
  digitalWrite(13,HIGH);
  delay(3000);
  digitalWrite(11,LOW);
  digitalWrite(12,LOW);
  digitalWrite(13,LOW);
}
void loop() {
  int result = digitalRead(2);
  if(result == HIGH) {
    //6번 초록,노랑,빨강순 3회 반복 0.1초간 켜지고 꺼짐
    for(int i=0; i<3; i++){
      digitalWrite(11,HIGH);
      delay(100);
      digitalWrite(11,LOW);
      digitalWrite(12,HIGH);
      delay(100);
      digitalWrite(12,LOW);
      digitalWrite(13,HIGH);
      delay(100);
      digitalWrite(13,LOW);
  }
  int randNumber = random(1,4); //4번,5번 난수값 1에서 3사이, 눌렀을 때 새로운 난수값
  Serial.println(randNumber); //7번 시리얼 모니터 출력
  if(randNumber == 1){  //난수값이 1인 경우 초록 LED ON
    digitalWrite(11,HIGH);
  }
  if(randNumber == 2){  //난수값이 2인 경우 초록,노랑 LED ON
    digitalWrite(11,HIGH);
    digitalWrite(12,HIGH);
  }
  if(randNumber == 3){  //난수값이 3인 경우, 초록,노랑,빨강 LED ON
    digitalWrite(11,HIGH);
    digitalWrite(12,HIGH);
    digitalWrite(13,HIGH);
  }

  }
  delay(200);
}
