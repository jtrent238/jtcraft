/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bcl
/*     */   implements bci
/*     */ {
/*     */   private final bao a;
/*     */   private final bcb b;
/*     */   private final bcb c;
/*     */   
/*     */   public bcl(bcb parambcb1, bcb parambcb2)
/*     */   {
/*  60 */     this.a = bao.B();
/*  61 */     this.b = parambcb1;
/*  62 */     this.c = parambcb2;
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, bmh parambmh, int paramInt6, int paramInt7, boolean paramBoolean)
/*     */   {
/*  67 */     if (this.b != null) {
/*  68 */       this.b.i = paramInt3;
/*  69 */       this.b.a(this.a, paramInt6, paramInt7);
/*     */     }
/*     */     
/*  72 */     if (this.c != null) {
/*  73 */       this.c.i = paramInt3;
/*  74 */       this.c.a(this.a, paramInt6, paramInt7);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  80 */     if (this.b.c(this.a, paramInt2, paramInt3)) {
/*  81 */       if ((this.b instanceof bcj)) {
/*  82 */         this.a.u.a(((bcj)this.b).d(), 1);
/*  83 */         this.b.j = this.a.u.c(bbm.a(this.b.k));
/*     */       }
/*  85 */       return true; }
/*  86 */     if ((this.c != null) && (this.c.c(this.a, paramInt2, paramInt3))) {
/*  87 */       if ((this.c instanceof bcj)) {
/*  88 */         this.a.u.a(((bcj)this.c).d(), 1);
/*  89 */         this.c.j = this.a.u.c(bbm.a(this.c.k));
/*     */       }
/*  91 */       return true;
/*     */     }
/*     */     
/*  94 */     return false;
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  99 */     if (this.b != null) this.b.a(paramInt2, paramInt3);
/* 100 */     if (this.c != null) this.c.a(paramInt2, paramInt3);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bcl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */