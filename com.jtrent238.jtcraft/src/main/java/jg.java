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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class jg
/*     */   extends jd
/*     */ {
/*     */   public jg()
/*     */   {
/* 101 */     this.i = true;
/*     */   }
/*     */   
/*     */   public jg(float paramFloat1, float paramFloat2, boolean paramBoolean) {
/* 105 */     this.e = paramFloat1;
/* 106 */     this.f = paramFloat2;
/* 107 */     this.g = paramBoolean;
/* 108 */     this.i = true;
/*     */   }
/*     */   
/*     */   public void a(et paramet)
/*     */   {
/* 113 */     this.e = paramet.readFloat();
/* 114 */     this.f = paramet.readFloat();
/* 115 */     super.a(paramet);
/*     */   }
/*     */   
/*     */   public void b(et paramet)
/*     */   {
/* 120 */     paramet.writeFloat(this.e);
/* 121 */     paramet.writeFloat(this.f);
/* 122 */     super.b(paramet);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\jg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */