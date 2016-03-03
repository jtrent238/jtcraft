/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class hi
/*     */   extends hf
/*     */ {
/*     */   public hi()
/*     */   {
/*  98 */     this.g = true;
/*     */   }
/*     */   
/*     */   public hi(int paramInt, byte paramByte1, byte paramByte2) {
/* 102 */     super(paramInt);
/* 103 */     this.e = paramByte1;
/* 104 */     this.f = paramByte2;
/* 105 */     this.g = true;
/*     */   }
/*     */   
/*     */   public void a(et paramet)
/*     */   {
/* 110 */     super.a(paramet);
/* 111 */     this.e = paramet.readByte();
/* 112 */     this.f = paramet.readByte();
/*     */   }
/*     */   
/*     */   public void b(et paramet)
/*     */   {
/* 117 */     super.b(paramet);
/* 118 */     paramet.writeByte(this.e);
/* 119 */     paramet.writeByte(this.f);
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/* 124 */     return super.b() + String.format(", yRot=%d, xRot=%d", new Object[] { Byte.valueOf(this.e), Byte.valueOf(this.f) });
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\hi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */