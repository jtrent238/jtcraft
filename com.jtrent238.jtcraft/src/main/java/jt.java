/*    */ import java.security.PublicKey;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jt
/*    */   extends ft
/*    */ {
/*    */   private String a;
/*    */   private PublicKey b;
/*    */   private byte[] c;
/*    */   
/*    */   public jt() {}
/*    */   
/*    */   public jt(String paramString, PublicKey paramPublicKey, byte[] paramArrayOfByte)
/*    */   {
/* 20 */     this.a = paramString;
/* 21 */     this.b = paramPublicKey;
/* 22 */     this.c = paramArrayOfByte;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 27 */     this.a = paramet.c(20);
/* 28 */     this.b = pt.a(a(paramet));
/* 29 */     this.c = a(paramet);
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 34 */     paramet.a(this.a);
/* 35 */     a(paramet, this.b.getEncoded());
/* 36 */     a(paramet, this.c);
/*    */   }
/*    */   
/*    */   public void a(jr paramjr)
/*    */   {
/* 41 */     paramjr.a(this);
/*    */   }
/*    */   
/*    */   public String c() {
/* 45 */     return this.a;
/*    */   }
/*    */   
/*    */   public PublicKey d() {
/* 49 */     return this.b;
/*    */   }
/*    */   
/*    */   public byte[] e() {
/* 53 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\jt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */