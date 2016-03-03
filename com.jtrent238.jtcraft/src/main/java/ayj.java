/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ayj
/*     */ {
/*     */   public final yz a;
/*  34 */   public int[] b = new int[''];
/*  35 */   public int[] c = new int[''];
/*     */   private int f;
/*     */   private int g;
/*     */   private byte[] h;
/*     */   public int d;
/*     */   private boolean i;
/*     */   
/*     */   public ayj(ayi paramayi, yz paramyz) {
/*  43 */     this.a = paramyz;
/*  44 */     for (int j = 0; j < this.b.length; j++) {
/*  45 */       this.b[j] = 0;
/*  46 */       this.c[j] = 127;
/*     */     }
/*     */   }
/*     */   
/*     */   public byte[] a(add paramadd) { byte[] arrayOfByte1;
/*  51 */     if (!this.i) {
/*  52 */       arrayOfByte1 = new byte[2];
/*  53 */       arrayOfByte1[0] = 2;
/*  54 */       arrayOfByte1[1] = this.e.d;
/*     */       
/*  56 */       this.i = true;
/*  57 */       return arrayOfByte1; }
/*     */     int k;
/*     */     int m;
/*  60 */     int n; if (--this.g < 0) {
/*  61 */       this.g = 4;
/*     */       
/*  63 */       arrayOfByte1 = new byte[this.e.g.size() * 3 + 1];
/*  64 */       arrayOfByte1[0] = 1;
/*  65 */       k = 0;
/*  66 */       for (ayk localayk : this.e.g.values()) {
/*  67 */         arrayOfByte1[(k * 3 + 1)] = ((byte)(localayk.a << 4 | localayk.d & 0xF));
/*  68 */         arrayOfByte1[(k * 3 + 2)] = localayk.b;
/*  69 */         arrayOfByte1[(k * 3 + 3)] = localayk.c;
/*  70 */         k++;
/*     */       }
/*  72 */       m = !paramadd.A() ? 1 : 0;
/*  73 */       if ((this.h == null) || (this.h.length != arrayOfByte1.length)) {
/*  74 */         m = 0;
/*     */       } else {
/*  76 */         for (n = 0; n < arrayOfByte1.length; n++) {
/*  77 */           if (arrayOfByte1[n] != this.h[n]) {
/*  78 */             m = 0;
/*  79 */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*  84 */       if (m == 0) {
/*  85 */         this.h = arrayOfByte1;
/*  86 */         return arrayOfByte1;
/*     */       }
/*     */     }
/*  89 */     for (int j = 0; j < 1; j++) {
/*  90 */       k = this.f++ * 11 % 128;
/*     */       
/*  92 */       if (this.b[k] >= 0) {
/*  93 */         m = this.c[k] - this.b[k] + 1;
/*  94 */         n = this.b[k];
/*     */         
/*  96 */         byte[] arrayOfByte2 = new byte[m + 3];
/*  97 */         arrayOfByte2[0] = 0;
/*  98 */         arrayOfByte2[1] = ((byte)k);
/*  99 */         arrayOfByte2[2] = ((byte)n);
/* 100 */         for (int i1 = 0; i1 < arrayOfByte2.length - 3; i1++) {
/* 101 */           arrayOfByte2[(i1 + 3)] = this.e.e[((i1 + n) * 128 + k)];
/*     */         }
/* 103 */         this.c[k] = -1;
/* 104 */         this.b[k] = -1;
/* 105 */         return arrayOfByte2;
/*     */       }
/*     */     }
/* 108 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ayj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */