/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bco
/*     */ {
/*  11 */   private static final bqx a = new bqx("textures/gui/stream_indicator.png");
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final bao b;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  23 */   private float c = 1.0F;
/*  24 */   private int d = 1;
/*     */   
/*     */   public bco(bao parambao) {
/*  27 */     this.b = parambao;
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2) {
/*  31 */     if (this.b.Z().n()) {
/*  32 */       GL11.glEnable(3042);
/*     */       
/*     */ 
/*  35 */       int i = this.b.Z().A();
/*  36 */       if (i > 0) {
/*  37 */         String str = "" + i;
/*  38 */         int j = this.b.l.a(str);
/*  39 */         int k = 20;
/*     */         
/*  41 */         int m = paramInt1 - j - 1;
/*  42 */         int n = paramInt2 + 20 - 1;
/*  43 */         int i1 = paramInt1;
/*  44 */         int i2 = paramInt2 + 20 + this.b.l.a - 1;
/*  45 */         GL11.glDisable(3553);
/*  46 */         bmh localbmh = bmh.a;
/*  47 */         GL11.glColor4f(0.0F, 0.0F, 0.0F, (0.65F + 0.35000002F * this.c) / 2.0F);
/*  48 */         localbmh.b();
/*  49 */         localbmh.a(m, i2, 0.0D);
/*  50 */         localbmh.a(i1, i2, 0.0D);
/*  51 */         localbmh.a(i1, n, 0.0D);
/*  52 */         localbmh.a(m, n, 0.0D);
/*  53 */         localbmh.a();
/*  54 */         GL11.glEnable(3553);
/*  55 */         this.b.l.b(str, paramInt1 - j, paramInt2 + 20, 16777215);
/*     */       }
/*     */       
/*     */ 
/*  59 */       a(paramInt1, paramInt2, b(), 0);
/*     */       
/*     */ 
/*  62 */       a(paramInt1, paramInt2, c(), 17);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  67 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.65F + 0.35000002F * this.c);
/*  68 */     this.b.P().a(a);
/*  69 */     float f1 = 150.0F;
/*     */     
/*  71 */     float f2 = 0.0F;
/*  72 */     float f3 = paramInt3 * 0.015625F;
/*  73 */     float f4 = 1.0F;
/*  74 */     float f5 = (paramInt3 + 16) * 0.015625F;
/*     */     
/*  76 */     bmh localbmh = bmh.a;
/*  77 */     localbmh.b();
/*  78 */     localbmh.a(paramInt1 - 16 - paramInt4, paramInt2 + 16, f1, f2, f5);
/*  79 */     localbmh.a(paramInt1 - paramInt4, paramInt2 + 16, f1, f4, f5);
/*  80 */     localbmh.a(paramInt1 - paramInt4, paramInt2 + 0, f1, f4, f3);
/*  81 */     localbmh.a(paramInt1 - 16 - paramInt4, paramInt2 + 0, f1, f2, f3);
/*  82 */     localbmh.a();
/*  83 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   private int b() {
/*  87 */     return this.b.Z().o() ? 16 : 0;
/*     */   }
/*     */   
/*     */   private int c() {
/*  91 */     return this.b.Z().G() ? 48 : 32;
/*     */   }
/*     */   
/*     */   public void a() {
/*  95 */     if (this.b.Z().n()) {
/*  96 */       this.c += 0.025F * this.d;
/*     */       
/*  98 */       if (this.c < 0.0F) {
/*  99 */         this.d *= -1;
/* 100 */         this.c = 0.0F;
/* 101 */       } else if (this.c > 1.0F) {
/* 102 */         this.d *= -1;
/* 103 */         this.c = 1.0F;
/*     */       }
/*     */     } else {
/* 106 */       this.c = 1.0F;
/* 107 */       this.d = 1;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bco.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */