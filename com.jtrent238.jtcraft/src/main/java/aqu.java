/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aqu
/*     */   implements apu
/*     */ {
/*     */   private ahb a;
/*     */   private Random b;
/*  25 */   private final aji[] c = new aji['Ā'];
/*  26 */   private final byte[] d = new byte['Ā'];
/*     */   private final ass e;
/*  28 */   private final List f = new ArrayList();
/*     */   private final boolean g;
/*     */   private final boolean h;
/*     */   private arx i;
/*     */   private arx j;
/*     */   
/*     */   public aqu(ahb paramahb, long paramLong, boolean paramBoolean, String paramString) {
/*  35 */     this.a = paramahb;
/*  36 */     this.b = new Random(paramLong);
/*  37 */     this.e = ass.a(paramString);
/*     */     Object localObject2;
/*  39 */     if (paramBoolean) {
/*  40 */       localObject1 = this.e.b();
/*     */       
/*  42 */       if (((Map)localObject1).containsKey("village")) {
/*  43 */         localObject2 = (Map)((Map)localObject1).get("village");
/*  44 */         if (!((Map)localObject2).containsKey("size")) ((Map)localObject2).put("size", "1");
/*  45 */         this.f.add(new avn((Map)localObject2));
/*     */       }
/*     */       
/*  48 */       if (((Map)localObject1).containsKey("biome_1")) this.f.add(new atx((Map)((Map)localObject1).get("biome_1")));
/*  49 */       if (((Map)localObject1).containsKey("mineshaft")) this.f.add(new asw((Map)((Map)localObject1).get("mineshaft")));
/*  50 */       if (((Map)localObject1).containsKey("stronghold")) { this.f.add(new aug((Map)((Map)localObject1).get("stronghold")));
/*     */       }
/*     */     }
/*  53 */     this.g = this.e.b().containsKey("decoration");
/*  54 */     if (this.e.b().containsKey("lake")) this.i = new arx(ajn.j);
/*  55 */     if (this.e.b().containsKey("lava_lake")) this.j = new arx(ajn.l);
/*  56 */     this.h = this.e.b().containsKey("dungeon");
/*     */     
/*  58 */     for (Object localObject1 = this.e.c().iterator(); ((Iterator)localObject1).hasNext();) { localObject2 = (ast)((Iterator)localObject1).next();
/*  59 */       for (int k = ((ast)localObject2).d(); k < ((ast)localObject2).d() + ((ast)localObject2).a(); k++) {
/*  60 */         this.c[k] = ((ast)localObject2).b();
/*  61 */         this.d[k] = ((byte)((ast)localObject2).c());
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public apx c(int paramInt1, int paramInt2)
/*     */   {
/*  69 */     return d(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */ 
/*     */   public apx d(int paramInt1, int paramInt2)
/*     */   {
/*  75 */     apx localapx = new apx(this.a, paramInt1, paramInt2);
/*     */     Object localObject2;
/*  77 */     for (int k = 0; k < this.c.length; k++) {
/*  78 */       localObject1 = this.c[k];
/*  79 */       if (localObject1 != null) {
/*  80 */         m = k >> 4;
/*  81 */         localObject2 = localapx.i()[m];
/*     */         
/*  83 */         if (localObject2 == null) {
/*  84 */           localObject2 = new apz(k, !this.a.t.g);
/*  85 */           localapx.i()[m] = localObject2;
/*     */         }
/*     */         
/*  88 */         for (int n = 0; n < 16; n++) {
/*  89 */           for (int i1 = 0; i1 < 16; i1++) {
/*  90 */             ((apz)localObject2).a(n, k & 0xF, i1, (aji)localObject1);
/*  91 */             ((apz)localObject2).a(n, k & 0xF, i1, this.d[k]);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*  96 */     localapx.b();
/*     */     
/*  98 */     ahu[] arrayOfahu = this.a.v().b(null, paramInt1 * 16, paramInt2 * 16, 16, 16);
/*  99 */     Object localObject1 = localapx.m();
/*     */     
/* 101 */     for (int m = 0; m < localObject1.length; m++) {
/* 102 */       localObject1[m] = ((byte)arrayOfahu[m].ay);
/*     */     }
/*     */     
/* 105 */     for (Iterator localIterator = this.f.iterator(); localIterator.hasNext();) { localObject2 = (aqx)localIterator.next();
/* 106 */       ((aqx)localObject2).a(this, this.a, paramInt1, paramInt2, null);
/*     */     }
/*     */     
/* 109 */     localapx.b();
/*     */     
/* 111 */     return localapx;
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2)
/*     */   {
/* 116 */     return true;
/*     */   }
/*     */   
/*     */   public void a(apu paramapu, int paramInt1, int paramInt2)
/*     */   {
/* 121 */     int k = paramInt1 * 16;
/* 122 */     int m = paramInt2 * 16;
/* 123 */     ahu localahu = this.a.a(k + 16, m + 16);
/* 124 */     boolean bool1 = false;
/*     */     
/* 126 */     this.b.setSeed(this.a.H());
/* 127 */     long l1 = this.b.nextLong() / 2L * 2L + 1L;
/* 128 */     long l2 = this.b.nextLong() / 2L * 2L + 1L;
/* 129 */     this.b.setSeed(paramInt1 * l1 + paramInt2 * l2 ^ this.a.H());
/*     */     
/* 131 */     for (ave localave : this.f) {
/* 132 */       boolean bool2 = localave.a(this.a, this.b, paramInt1, paramInt2);
/* 133 */       if ((localave instanceof avn)) bool1 |= bool2; }
/*     */     int n;
/*     */     int i1;
/* 136 */     int i2; if ((this.i != null) && (!bool1) && (this.b.nextInt(4) == 0)) {
/* 137 */       n = k + this.b.nextInt(16) + 8;
/* 138 */       i1 = this.b.nextInt(256);
/* 139 */       i2 = m + this.b.nextInt(16) + 8;
/* 140 */       this.i.a(this.a, this.b, n, i1, i2);
/*     */     }
/*     */     
/* 143 */     if ((this.j != null) && (!bool1) && (this.b.nextInt(8) == 0)) {
/* 144 */       n = k + this.b.nextInt(16) + 8;
/* 145 */       i1 = this.b.nextInt(this.b.nextInt(248) + 8);
/* 146 */       i2 = m + this.b.nextInt(16) + 8;
/* 147 */       if ((i1 < 63) || (this.b.nextInt(10) == 0)) {
/* 148 */         this.j.a(this.a, this.b, n, i1, i2);
/*     */       }
/*     */     }
/*     */     
/* 152 */     if (this.h) {
/* 153 */       for (n = 0; n < 8; n++) {
/* 154 */         i1 = k + this.b.nextInt(16) + 8;
/* 155 */         i2 = this.b.nextInt(256);
/* 156 */         int i3 = m + this.b.nextInt(16) + 8;
/* 157 */         new asd().a(this.a, this.b, i1, i2, i3);
/*     */       }
/*     */     }
/*     */     
/* 161 */     if (this.g) {
/* 162 */       localahu.a(this.a, this.b, k, m);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(boolean paramBoolean, qk paramqk)
/*     */   {
/* 168 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public void c() {}
/*     */   
/*     */ 
/*     */   public boolean d()
/*     */   {
/* 177 */     return false;
/*     */   }
/*     */   
/*     */   public boolean e()
/*     */   {
/* 182 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public String f()
/*     */   {
/* 188 */     return "FlatLevelSource";
/*     */   }
/*     */   
/*     */   public List a(sx paramsx, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 193 */     ahu localahu = this.a.a(paramInt1, paramInt3);
/* 194 */     return localahu.a(paramsx);
/*     */   }
/*     */   
/*     */   public agt a(ahb paramahb, String paramString, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 199 */     if ("Stronghold".equals(paramString)) {
/* 200 */       for (ave localave : this.f) {
/* 201 */         if ((localave instanceof aug)) {
/* 202 */           return localave.a(paramahb, paramInt1, paramInt2, paramInt3);
/*     */         }
/*     */       }
/*     */     }
/* 206 */     return null;
/*     */   }
/*     */   
/*     */   public int g()
/*     */   {
/* 211 */     return 0;
/*     */   }
/*     */   
/*     */   public void e(int paramInt1, int paramInt2)
/*     */   {
/* 216 */     for (ave localave : this.f) {
/* 217 */       localave.a(this, this.a, paramInt1, paramInt2, null);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aqu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */