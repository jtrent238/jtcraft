/*     */ import java.util.List;
/*     */ import org.apache.commons.io.Charsets;
/*     */ import org.lwjgl.input.Keyboard;
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
/*     */ public class bey
/*     */   extends bex
/*     */   implements aac
/*     */ {
/*  21 */   private static final bqx u = new bqx("textures/gui/container/anvil.png");
/*     */   private zu v;
/*     */   private bcd w;
/*     */   private yx x;
/*     */   
/*     */   public bey(yx paramyx, ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  28 */     super(new zu(paramyx, paramahb, paramInt1, paramInt2, paramInt3, bao.B().h));
/*  29 */     this.x = paramyx;
/*  30 */     this.v = ((zu)this.h);
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  35 */     super.b();
/*  36 */     Keyboard.enableRepeatEvents(true);
/*     */     
/*  38 */     int i = (this.l - this.f) / 2;
/*  39 */     int j = (this.m - this.g) / 2;
/*     */     
/*  41 */     this.w = new bcd(this.q, i + 62, j + 24, 103, 12);
/*  42 */     this.w.g(-1);
/*  43 */     this.w.h(-1);
/*  44 */     this.w.a(false);
/*  45 */     this.w.f(40);
/*     */     
/*  47 */     this.h.b(this);
/*  48 */     this.h.a(this);
/*     */   }
/*     */   
/*     */   public void m()
/*     */   {
/*  53 */     super.m();
/*     */     
/*  55 */     Keyboard.enableRepeatEvents(false);
/*  56 */     this.h.b(this);
/*     */   }
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2)
/*     */   {
/*  61 */     GL11.glDisable(2896);
/*  62 */     GL11.glDisable(3042);
/*  63 */     this.q.b(brp.a("container.repair", new Object[0]), 60, 6, 4210752);
/*     */     
/*  65 */     if (this.v.a > 0) {
/*  66 */       int i = 8453920;
/*  67 */       int j = 1;
/*  68 */       String str = brp.a("container.repair.cost", new Object[] { Integer.valueOf(this.v.a) });
/*  69 */       if ((this.v.a >= 40) && (!this.k.h.bE.d)) {
/*  70 */         str = brp.a("container.repair.expensive", new Object[0]);
/*  71 */         i = 16736352;
/*  72 */       } else if (!this.v.a(2).e()) {
/*  73 */         j = 0;
/*  74 */       } else if (!this.v.a(2).a(this.x.d)) {
/*  75 */         i = 16736352;
/*     */       }
/*     */       
/*  78 */       if (j != 0) {
/*  79 */         int k = 0xFF000000 | (i & 0xFCFCFC) >> 2 | i & 0xFF000000;
/*  80 */         int m = this.f - 8 - this.q.a(str);
/*  81 */         int n = 67;
/*  82 */         if (this.q.a()) {
/*  83 */           a(m - 3, n - 2, this.f - 7, n + 10, -16777216);
/*  84 */           a(m - 2, n - 1, this.f - 8, n + 9, -12895429);
/*     */         } else {
/*  86 */           this.q.b(str, m, n + 1, k);
/*  87 */           this.q.b(str, m + 1, n, k);
/*  88 */           this.q.b(str, m + 1, n + 1, k);
/*     */         }
/*  90 */         this.q.b(str, m, n, i);
/*     */       }
/*     */     }
/*  93 */     GL11.glEnable(2896);
/*     */   }
/*     */   
/*     */   protected void a(char paramChar, int paramInt)
/*     */   {
/*  98 */     if (this.w.a(paramChar, paramInt)) {
/*  99 */       a();
/*     */     } else {
/* 101 */       super.a(paramChar, paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a() {
/* 106 */     String str = this.w.b();
/*     */     
/* 108 */     aay localaay = this.v.a(0);
/* 109 */     if ((localaay != null) && (localaay.e()) && 
/* 110 */       (!localaay.d().u()) && (str.equals(localaay.d().s()))) {
/* 111 */       str = "";
/*     */     }
/*     */     
/*     */ 
/* 115 */     this.v.a(str);
/* 116 */     this.k.h.a.a(new iz("MC|ItemName", str.getBytes(Charsets.UTF_8)));
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 121 */     super.a(paramInt1, paramInt2, paramInt3);
/* 122 */     this.w.a(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 127 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */     
/* 129 */     GL11.glDisable(2896);
/* 130 */     GL11.glDisable(3042);
/* 131 */     this.w.f();
/*     */   }
/*     */   
/*     */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/*     */   {
/* 136 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 137 */     this.k.P().a(u);
/* 138 */     int i = (this.l - this.f) / 2;
/* 139 */     int j = (this.m - this.g) / 2;
/* 140 */     b(i, j, 0, 0, this.f, this.g);
/*     */     
/* 142 */     b(i + 59, j + 20, 0, this.g + (this.v.a(0).e() ? 0 : 16), 110, 16);
/*     */     
/* 144 */     if (((this.v.a(0).e()) || (this.v.a(1).e())) && (!this.v.a(2).e())) {
/* 145 */       b(i + 99, j + 45, this.f, 0, 28, 21);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(zs paramzs, List paramList)
/*     */   {
/* 151 */     a(paramzs, 0, paramzs.a(0).d());
/*     */   }
/*     */   
/*     */   public void a(zs paramzs, int paramInt, add paramadd)
/*     */   {
/* 156 */     if (paramInt == 0) {
/* 157 */       this.w.a(paramadd == null ? "" : paramadd.s());
/* 158 */       this.w.c(paramadd != null);
/* 159 */       if (paramadd != null) {
/* 160 */         a();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(zs paramzs, int paramInt1, int paramInt2) {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */