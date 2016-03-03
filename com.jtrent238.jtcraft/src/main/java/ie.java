/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ie
/*    */   extends ft
/*    */ {
/* 16 */   private String a = "";
/* 17 */   private String b = "";
/*    */   private int c;
/*    */   private int d;
/*    */   
/*    */   public ie() {}
/*    */   
/*    */   public ie(azz paramazz, int paramInt)
/*    */   {
/* 25 */     this.a = paramazz.e();
/* 26 */     this.b = paramazz.d().b();
/* 27 */     this.c = paramazz.c();
/* 28 */     this.d = paramInt;
/*    */   }
/*    */   
/*    */   public ie(String paramString) {
/* 32 */     this.a = paramString;
/* 33 */     this.b = "";
/* 34 */     this.c = 0;
/* 35 */     this.d = 1;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 40 */     this.a = paramet.c(16);
/* 41 */     this.d = paramet.readByte();
/*    */     
/* 43 */     if (this.d != 1) {
/* 44 */       this.b = paramet.c(16);
/* 45 */       this.c = paramet.readInt();
/*    */     }
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 51 */     paramet.a(this.a);
/* 52 */     paramet.writeByte(this.d);
/*    */     
/* 54 */     if (this.d != 1) {
/* 55 */       paramet.a(this.b);
/* 56 */       paramet.writeInt(this.c);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 62 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public String c() {
/* 66 */     return this.a;
/*    */   }
/*    */   
/*    */   public String d() {
/* 70 */     return this.b;
/*    */   }
/*    */   
/*    */   public int e() {
/* 74 */     return this.c;
/*    */   }
/*    */   
/*    */   public int f() {
/* 78 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */