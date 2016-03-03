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
/*     */ public class hf
/*     */   extends ft
/*     */ {
/*     */   protected int a;
/*     */   protected byte b;
/*     */   protected byte c;
/*     */   protected byte d;
/*     */   protected byte e;
/*     */   protected byte f;
/*     */   protected boolean g;
/*     */   
/*     */   public hf() {}
/*     */   
/*     */   public hf(int paramInt)
/*     */   {
/* 133 */     this.a = paramInt;
/*     */   }
/*     */   
/*     */   public void a(et paramet)
/*     */   {
/* 138 */     this.a = paramet.readInt();
/*     */   }
/*     */   
/*     */   public void b(et paramet)
/*     */   {
/* 143 */     paramet.writeInt(this.a);
/*     */   }
/*     */   
/*     */   public void a(fv paramfv)
/*     */   {
/* 148 */     paramfv.a(this);
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/* 153 */     return String.format("id=%d", new Object[] { Integer.valueOf(this.a) });
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 158 */     return "Entity_" + super.toString();
/*     */   }
/*     */   
/*     */   public sa a(ahb paramahb) {
/* 162 */     return paramahb.a(this.a);
/*     */   }
/*     */   
/*     */   public byte c() {
/* 166 */     return this.b;
/*     */   }
/*     */   
/*     */   public byte d() {
/* 170 */     return this.c;
/*     */   }
/*     */   
/*     */   public byte e() {
/* 174 */     return this.d;
/*     */   }
/*     */   
/*     */   public byte f() {
/* 178 */     return this.e;
/*     */   }
/*     */   
/*     */   public byte g() {
/* 182 */     return this.f;
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 186 */     return this.g;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\hf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */