/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import net.minecraft.realms.RealmsButton;
/*     */ import net.minecraft.realms.RealmsScreen;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bcq
/*     */   extends bdw
/*     */ {
/*     */   private RealmsScreen a;
/*     */   
/*     */   public bcq(RealmsScreen paramRealmsScreen)
/*     */   {
/*  27 */     this.a = paramRealmsScreen;
/*  28 */     this.n = Collections.synchronizedList(new ArrayList());
/*     */   }
/*     */   
/*     */   public RealmsScreen a() {
/*  32 */     return this.a;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void b()
/*     */   {
/*  41 */     this.a.init();
/*  42 */     super.b();
/*     */   }
/*     */   
/*     */   public void a(String paramString, int paramInt1, int paramInt2, int paramInt3) {
/*  46 */     super.a(this.q, paramString, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void b(String paramString, int paramInt1, int paramInt2, int paramInt3) {
/*  50 */     super.b(this.q, paramString, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */ 
/*     */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  56 */     this.a.blit(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  57 */     super.b(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  70 */     super.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */   }
/*     */   
/*     */   public void c() {
/*  74 */     super.c();
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  79 */     return super.d();
/*     */   }
/*     */   
/*     */   public void c_(int paramInt) {
/*  83 */     super.c_(paramInt);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/*  88 */     this.a.render(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */   
/*     */   public void a(add paramadd, int paramInt1, int paramInt2) {
/*  92 */     super.a(paramadd, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public void a(String paramString, int paramInt1, int paramInt2) {
/*  96 */     super.a(paramString, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public void a(List paramList, int paramInt1, int paramInt2) {
/* 100 */     super.a(paramList, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void e()
/*     */   {
/* 119 */     this.a.tick();
/* 120 */     super.e();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int h()
/*     */   {
/* 137 */     return this.q.a;
/*     */   }
/*     */   
/*     */   public int c(String paramString) {
/* 141 */     return this.q.a(paramString);
/*     */   }
/*     */   
/*     */   public void c(String paramString, int paramInt1, int paramInt2, int paramInt3) {
/* 145 */     this.q.a(paramString, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public List a(String paramString, int paramInt) {
/* 149 */     return this.q.c(paramString, paramInt);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final void a(bcb parambcb)
/*     */   {
/* 160 */     this.a.buttonClicked(((bcp)parambcb).g());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void i()
/*     */   {
/* 175 */     this.n.clear();
/*     */   }
/*     */   
/*     */   public void a(RealmsButton paramRealmsButton) {
/* 179 */     this.n.add(paramRealmsButton.getProxy());
/*     */   }
/*     */   
/*     */   public List j() {
/* 183 */     ArrayList localArrayList = new ArrayList(this.n.size());
/* 184 */     for (bcb localbcb : this.n) {
/* 185 */       localArrayList.add(((bcp)localbcb).g());
/*     */     }
/* 187 */     return localArrayList;
/*     */   }
/*     */   
/*     */   public void b(RealmsButton paramRealmsButton) {
/* 191 */     this.n.remove(paramRealmsButton);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 209 */     this.a.mouseClicked(paramInt1, paramInt2, paramInt3);
/* 210 */     super.a(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void k()
/*     */   {
/* 215 */     this.a.mouseEvent();
/* 216 */     super.k();
/*     */   }
/*     */   
/*     */   public void l()
/*     */   {
/* 221 */     this.a.keyboardEvent();
/* 222 */     super.l();
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 227 */     this.a.mouseReleased(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, long paramLong)
/*     */   {
/* 232 */     this.a.mouseDragged(paramInt1, paramInt2, paramInt3, paramLong);
/*     */   }
/*     */   
/*     */   public void a(char paramChar, int paramInt)
/*     */   {
/* 237 */     this.a.keyPressed(paramChar, paramInt);
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(boolean paramBoolean, int paramInt)
/*     */   {
/* 243 */     this.a.confirmResult(paramBoolean, paramInt);
/*     */   }
/*     */   
/*     */   public void m() {
/* 247 */     this.a.removed();
/* 248 */     super.m();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bcq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */