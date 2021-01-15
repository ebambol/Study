int timex = 1000;
int arr1[] = {13, 12, 11};

void setup() {
  pinMode(13,OUTPUT); //빨
  pinMode(12,OUTPUT); //노
  pinMode(11,OUTPUT); //초

  digitalWrite(13,HIGH);
  digitalWrite(12,HIGH);
  digitalWrite(11,HIGH);
  delay(1000);

  digitalWrite(13,LOW);
  digitalWrite(12,LOW);
  digitalWrite(11,LOW);
  delay(500);
}

void loop() {
  //빨강 켜기 = > 노랑 켜기 => 초록켜기
  //초록 끄기 => 노랑끄기 => 빨강끄기
  //빨강 켜기 => 노랑 켜기 => 초록 켜기
  //빨강끄기 => 노랑 끄기 -> 초록 끄기
for(int num : arr1){
  digitalWrite(num,HIGH);
  delay(timex);
}
for(int i = 11; i <= 13 ; i++){
  digitalWrite(i,LOW);
  delay(timex);
}
for(int num : arr1){
  digitalWrite(num,HIGH);
  delay(timex);
}
for(int num : arr1){
  digitalWrite(num,LOW);
  delay(timex);
}
/* 원래코드
  digitalWrite(13,HIGH);
  delay(timex);
  digitalWrite(12,HIGH);
  delay(timex);
  digitalWrite(11,HIGH);
  delay(timex);  
  
  digitalWrite(11,LOW);
  delay(timex);
  digitalWrite(12,LOW);
  delay(timex);
  digitalWrite(13,LOW);
  delay(timex);

  digitalWrite(13,HIGH);
  delay(timex);
  digitalWrite(12,HIGH);
  delay(timex);
  digitalWrite(11,HIGH);
  delay(timex);  

  digitalWrite(13,LOW);
  delay(timex);
  digitalWrite(12,LOW);
  delay(timex);
  digitalWrite(11,LOW);
  delay(timex);
*/
}
