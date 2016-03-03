/*     */ import java.util.List;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class bda
/*     */   extends bcm
/*     */ {
/* 133 */   public int k = -1;
/*     */   
/*     */   public bda(bcz parambcz) {
/* 136 */     super(parambcz.k, parambcz.l, parambcz.m, 43, parambcz.m - 60, 24);
/*     */   }
/*     */   
/*     */   private void a(int paramInt1, int paramInt2, add paramadd) {
/* 140 */     e(paramInt1 + 1, paramInt2 + 1);
/*     */     
/* 142 */     GL11.glEnable(32826);
/*     */     
/* 144 */     if (paramadd != null) {
/* 145 */       bam.c();
/* 146 */       bcz.g().a(this.l.q, this.l.k.P(), paramadd, paramInt1 + 2, paramInt2 + 2);
/* 147 */       bam.a();
/*     */     }
/*     */     
/* 150 */     GL11.glDisable(32826);
/*     */   }
/*     */   
/*     */   private void e(int paramInt1, int paramInt2) {
/* 154 */     c(paramInt1, paramInt2, 0, 0);
/*     */   }
/*     */   
/*     */   private void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 158 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 159 */     this.l.k.P().a(bbw.c);
/*     */     
/* 161 */     float f1 = 0.0078125F;
/* 162 */     float f2 = 0.0078125F;
/* 163 */     int i = 18;
/* 164 */     int j = 18;
/* 165 */     bmh localbmh = bmh.a;
/* 166 */     localbmh.b();
/* 167 */     localbmh.a(paramInt1 + 0, paramInt2 + 18, bcz.a(this.l), (paramInt3 + 0) * 0.0078125F, (paramInt4 + 18) * 0.0078125F);
/* 168 */     localbmh.a(paramInt1 + 18, paramInt2 + 18, bcz.b(this.l), (paramInt3 + 18) * 0.0078125F, (paramInt4 + 18) * 0.0078125F);
/* 169 */     localbmh.a(paramInt1 + 18, paramInt2 + 0, bcz.c(this.l), (paramInt3 + 18) * 0.0078125F, (paramInt4 + 0) * 0.0078125F);
/* 170 */     localbmh.a(paramInt1 + 0, paramInt2 + 0, bcz.d(this.l), (paramInt3 + 0) * 0.0078125F, (paramInt4 + 0) * 0.0078125F);
/* 171 */     localbmh.a();
/*     */   }
/*     */   
/*     */   protected int b()
/*     */   {
/* 176 */     return bcz.e(this.l).c().size();
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
/*     */   {
/* 181 */     this.k = paramInt1;
/* 182 */     this.l.f();
/*     */   }
/*     */   
/*     */   protected boolean a(int paramInt)
/*     */   {
/* 187 */     return paramInt == this.k;
/*     */   }
/*     */   
/*     */ 
/*     */   protected void a() {}
/*     */   
/*     */ 
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, bmh parambmh, int paramInt5, int paramInt6)
/*     */   {
/* 196 */     ast localast = (ast)bcz.e(this.l).c().get(bcz.e(this.l).c().size() - paramInt1 - 1);
/*     */     
/*     */ 
/* 199 */     adb localadb = adb.a(localast.b());
/* 200 */     add localadd = localast.b() == ajn.a ? null : new add(localadb, 1, localast.c());
/* 201 */     String str1 = (localadd == null) || (localadb == null) ? "Air" : localadb.n(localadd);
/*     */     
/* 203 */     a(paramInt2, paramInt3, localadd);
/* 204 */     this.l.q.b(str1, paramInt2 + 18 + 5, paramInt3 + 3, 16777215);
/*     */     
/*     */     String str2;
/*     */     
/* 208 */     if (paramInt1 == 0) {
/* 209 */       str2 = brp.a("createWorld.customize.flat.layer.top", new Object[] { Integer.valueOf(localast.a()) });
/* 210 */     } else if (paramInt1 == bcz.e(this.l).c().size() - 1) {
/* 211 */       str2 = brp.a("createWorld.customize.flat.layer.bottom", new Object[] { Integer.valueOf(localast.a()) });
/*     */     } else {
/* 213 */       str2 = brp.a("createWorld.customize.flat.layer", new Object[] { Integer.valueOf(localast.a()) });
/*     */     }
/*     */     
/* 216 */     this.l.q.b(str2, paramInt2 + 2 + 213 - this.l.q.a(str2), paramInt3 + 3, 16777215);
/*     */   }
/*     */   
/*     */   protected int d()
/*     */   {
/* 221 */     return this.a - 70;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */