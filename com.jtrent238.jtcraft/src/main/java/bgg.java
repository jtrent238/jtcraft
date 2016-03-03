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
/*     */ public abstract class bgg
/*     */   implements bci
/*     */ {
/*  15 */   private static final bqx c = new bqx("textures/gui/resource_packs.png");
/*     */   
/*     */ 
/*     */ 
/*     */   protected final bao a;
/*     */   
/*     */ 
/*     */ 
/*     */   protected final bgf b;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public bgg(bgf parambgf)
/*     */   {
/*  30 */     this.b = parambgf;
/*  31 */     this.a = bao.B();
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, bmh parambmh, int paramInt6, int paramInt7, boolean paramBoolean)
/*     */   {
/*  36 */     c();
/*     */     
/*  38 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  39 */     bbw.a(paramInt2, paramInt3, 0.0F, 0.0F, 32, 32, 32.0F, 32.0F);
/*     */     
/*  41 */     if (((this.a.u.y) || (paramBoolean)) && (d())) {
/*  42 */       this.a.P().a(c);
/*  43 */       bbw.a(paramInt2, paramInt3, paramInt2 + 32, paramInt3 + 32, -1601138544);
/*  44 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  45 */       int i = paramInt6 - paramInt2;
/*  46 */       j = paramInt7 - paramInt3;
/*     */       
/*  48 */       if (e()) {
/*  49 */         if (i < 32) {
/*  50 */           bbw.a(paramInt2, paramInt3, 0.0F, 32.0F, 32, 32, 256.0F, 256.0F);
/*     */         } else {
/*  52 */           bbw.a(paramInt2, paramInt3, 0.0F, 0.0F, 32, 32, 256.0F, 256.0F);
/*     */         }
/*     */       } else {
/*  55 */         if (f()) {
/*  56 */           if (i < 16) {
/*  57 */             bbw.a(paramInt2, paramInt3, 32.0F, 32.0F, 32, 32, 256.0F, 256.0F);
/*     */           } else {
/*  59 */             bbw.a(paramInt2, paramInt3, 32.0F, 0.0F, 32, 32, 256.0F, 256.0F);
/*     */           }
/*     */         }
/*  62 */         if (g()) {
/*  63 */           if ((i < 32) && (i > 16) && (j < 16)) {
/*  64 */             bbw.a(paramInt2, paramInt3, 96.0F, 32.0F, 32, 32, 256.0F, 256.0F);
/*     */           } else {
/*  66 */             bbw.a(paramInt2, paramInt3, 96.0F, 0.0F, 32, 32, 256.0F, 256.0F);
/*     */           }
/*     */         }
/*  69 */         if (h()) {
/*  70 */           if ((i < 32) && (i > 16) && (j > 16)) {
/*  71 */             bbw.a(paramInt2, paramInt3, 64.0F, 32.0F, 32, 32, 256.0F, 256.0F);
/*     */           } else {
/*  73 */             bbw.a(paramInt2, paramInt3, 64.0F, 0.0F, 32, 32, 256.0F, 256.0F);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*  80 */     String str = b();
/*  81 */     int j = this.a.l.a(str);
/*  82 */     if (j > 157) {
/*  83 */       str = this.a.l.a(str, 157 - this.a.l.a("...")) + "...";
/*     */     }
/*  85 */     this.a.l.a(str, paramInt2 + 32 + 2, paramInt3 + 1, 16777215);
/*  86 */     List localList = this.a.l.c(a(), 157);
/*     */     
/*  88 */     for (int k = 0; (k < 2) && (k < localList.size()); k++) {
/*  89 */       this.a.l.a((String)localList.get(k), paramInt2 + 32 + 2, paramInt3 + 12 + 10 * k, 8421504);
/*     */     }
/*     */   }
/*     */   
/*     */   protected abstract String a();
/*     */   
/*     */   protected abstract String b();
/*     */   
/*     */   protected abstract void c();
/*     */   
/*     */   protected boolean d() {
/* 100 */     return true;
/*     */   }
/*     */   
/*     */   protected boolean e() {
/* 104 */     return !this.b.a(this);
/*     */   }
/*     */   
/*     */   protected boolean f() {
/* 108 */     return this.b.a(this);
/*     */   }
/*     */   
/*     */   protected boolean g() {
/* 112 */     List localList = this.b.b(this);
/* 113 */     int i = localList.indexOf(this);
/* 114 */     return (i > 0) && (((bgg)localList.get(i - 1)).d());
/*     */   }
/*     */   
/*     */   protected boolean h() {
/* 118 */     List localList = this.b.b(this);
/* 119 */     int i = localList.indexOf(this);
/* 120 */     return (i >= 0) && (i < localList.size() - 1) && (((bgg)localList.get(i + 1)).d());
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/* 125 */     if ((d()) && (paramInt5 <= 32)) {
/* 126 */       if (e())
/*     */       {
/* 128 */         this.b.b(this).remove(this);
/* 129 */         this.b.f().add(0, this);
/* 130 */         return true;
/*     */       }
/* 132 */       if ((paramInt5 < 16) && (f()))
/*     */       {
/* 134 */         this.b.b(this).remove(this);
/* 135 */         this.b.a().add(0, this);
/* 136 */         return true; }
/*     */       List localList;
/* 138 */       int i; if ((paramInt5 > 16) && (paramInt6 < 16) && (g()))
/*     */       {
/* 140 */         localList = this.b.b(this);
/* 141 */         i = localList.indexOf(this);
/* 142 */         localList.remove(this);
/* 143 */         localList.add(i - 1, this);
/* 144 */         return true;
/*     */       }
/* 146 */       if ((paramInt5 > 16) && (paramInt6 > 16) && (h()))
/*     */       {
/* 148 */         localList = this.b.b(this);
/* 149 */         i = localList.indexOf(this);
/* 150 */         localList.remove(this);
/* 151 */         localList.add(i + 1, this);
/* 152 */         return true;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 157 */     return false;
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bgg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */