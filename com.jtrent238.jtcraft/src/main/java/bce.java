/*     */ import java.util.ArrayList;
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
/*     */ public class bce
/*     */   extends bbw
/*     */ {
/*     */   protected int a;
/*     */   protected int f;
/*     */   public int g;
/*     */   public int h;
/*     */   private ArrayList k;
/*     */   private boolean l;
/*     */   public boolean j;
/*     */   private boolean m;
/*     */   private int n;
/*     */   private int o;
/*     */   private int p;
/*     */   private int q;
/*     */   private bbu r;
/*     */   private int s;
/*     */   
/*     */   public void a(bao parambao, int paramInt1, int paramInt2)
/*     */   {
/*  74 */     if (!this.j) { return;
/*     */     }
/*  76 */     GL11.glEnable(3042);
/*  77 */     buu.c(770, 771, 1, 0);
/*  78 */     GL11.glBlendFunc(770, 771);
/*     */     
/*  80 */     b(parambao, paramInt1, paramInt2);
/*  81 */     int i = this.h + this.f / 2 + this.s / 2;
/*  82 */     int i1 = i - this.k.size() * 10 / 2;
/*  83 */     for (int i2 = 0; i2 < this.k.size(); i2++) {
/*  84 */       if (this.l) {
/*  85 */         a(this.r, (String)this.k.get(i2), this.g + this.a / 2, i1 + i2 * 10, this.n);
/*     */       } else {
/*  87 */         b(this.r, (String)this.k.get(i2), this.g, i1 + i2 * 10, this.n);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void b(bao parambao, int paramInt1, int paramInt2) {
/*  93 */     if (this.m) {
/*  94 */       int i = this.a + this.s * 2;
/*  95 */       int i1 = this.f + this.s * 2;
/*  96 */       int i2 = this.g - this.s;
/*  97 */       int i3 = this.h - this.s;
/*  98 */       a(i2, i3, i2 + i, i3 + i1, this.o);
/*  99 */       a(i2, i2 + i, i3, this.p);
/* 100 */       a(i2, i2 + i, i3 + i1, this.q);
/* 101 */       b(i2, i3, i3 + i1, this.p);
/* 102 */       b(i2 + i, i3, i3 + i1, this.q);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */