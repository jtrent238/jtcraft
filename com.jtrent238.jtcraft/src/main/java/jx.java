/*    */ import java.security.PrivateKey;
/*    */ import java.security.PublicKey;
/*    */ import javax.crypto.SecretKey;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jx
/*    */   extends ft
/*    */ {
/* 13 */   private byte[] a = new byte[0];
/* 14 */   private byte[] b = new byte[0];
/*    */   
/*    */ 
/*    */   public jx() {}
/*    */   
/*    */   public jx(SecretKey paramSecretKey, PublicKey paramPublicKey, byte[] paramArrayOfByte)
/*    */   {
/* 21 */     this.a = pt.a(paramPublicKey, paramSecretKey.getEncoded());
/* 22 */     this.b = pt.a(paramPublicKey, paramArrayOfByte);
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 27 */     this.a = a(paramet);
/* 28 */     this.b = a(paramet);
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 33 */     a(paramet, this.a);
/* 34 */     a(paramet, this.b);
/*    */   }
/*    */   
/*    */   public void a(jv paramjv)
/*    */   {
/* 39 */     paramjv.a(this);
/*    */   }
/*    */   
/*    */   public SecretKey a(PrivateKey paramPrivateKey) {
/* 43 */     return pt.a(paramPrivateKey, this.a);
/*    */   }
/*    */   
/*    */   public byte[] b(PrivateKey paramPrivateKey) {
/* 47 */     if (paramPrivateKey == null) {
/* 48 */       return this.b;
/*    */     }
/* 50 */     return pt.b(paramPrivateKey, this.b);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\jx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */