/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.Callable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class k
/*     */ {
/*     */   private final b a;
/*     */   private final String b;
/*  13 */   private final List c = new ArrayList();
/*  14 */   private StackTraceElement[] d = new StackTraceElement[0];
/*     */   
/*     */   public k(b paramb, String paramString) {
/*  17 */     this.a = paramb;
/*  18 */     this.b = paramString;
/*     */   }
/*     */   
/*     */   public static String a(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  22 */     return String.format("%.2f,%.2f,%.2f - %s", new Object[] { Double.valueOf(paramDouble1), Double.valueOf(paramDouble2), Double.valueOf(paramDouble3), a(qh.c(paramDouble1), qh.c(paramDouble2), qh.c(paramDouble3)) });
/*     */   }
/*     */   
/*     */   public static String a(int paramInt1, int paramInt2, int paramInt3) {
/*  26 */     StringBuilder localStringBuilder = new StringBuilder();
/*     */     try
/*     */     {
/*  29 */       localStringBuilder.append(String.format("World: (%d,%d,%d)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }));
/*     */     } catch (Throwable localThrowable1) {
/*  31 */       localStringBuilder.append("(Error finding world loc)");
/*     */     }
/*     */     
/*  34 */     localStringBuilder.append(", ");
/*     */     int k;
/*     */     int m;
/*  37 */     int n; int i1; int i2; int i3; int i4; int i5; try { int i = paramInt1 >> 4;
/*  38 */       k = paramInt3 >> 4;
/*  39 */       m = paramInt1 & 0xF;
/*  40 */       n = paramInt2 >> 4;
/*  41 */       i1 = paramInt3 & 0xF;
/*  42 */       i2 = i << 4;
/*  43 */       i3 = k << 4;
/*  44 */       i4 = (i + 1 << 4) - 1;
/*  45 */       i5 = (k + 1 << 4) - 1;
/*  46 */       localStringBuilder.append(String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", new Object[] { Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5) }));
/*     */     } catch (Throwable localThrowable2) {
/*  48 */       localStringBuilder.append("(Error finding chunk loc)");
/*     */     }
/*     */     
/*  51 */     localStringBuilder.append(", ");
/*     */     try
/*     */     {
/*  54 */       int j = paramInt1 >> 9;
/*  55 */       k = paramInt3 >> 9;
/*  56 */       m = j << 5;
/*  57 */       n = k << 5;
/*  58 */       i1 = (j + 1 << 5) - 1;
/*  59 */       i2 = (k + 1 << 5) - 1;
/*  60 */       i3 = j << 9;
/*  61 */       i4 = k << 9;
/*  62 */       i5 = (j + 1 << 9) - 1;
/*  63 */       int i6 = (k + 1 << 9) - 1;
/*  64 */       localStringBuilder.append(String.format("Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6) }));
/*     */     } catch (Throwable localThrowable3) {
/*  66 */       localStringBuilder.append("(Error finding world loc)");
/*     */     }
/*     */     
/*  69 */     return localStringBuilder.toString();
/*     */   }
/*     */   
/*     */   public void a(String paramString, Callable paramCallable) {
/*     */     try {
/*  74 */       a(paramString, paramCallable.call());
/*     */     } catch (Throwable localThrowable) {
/*  76 */       a(paramString, localThrowable);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(String paramString, Object paramObject) {
/*  81 */     this.c.add(new o(paramString, paramObject));
/*     */   }
/*     */   
/*     */   public void a(String paramString, Throwable paramThrowable) {
/*  85 */     a(paramString, paramThrowable);
/*     */   }
/*     */   
/*     */   public int a(int paramInt) {
/*  89 */     StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
/*     */     
/*     */ 
/*  92 */     if (arrayOfStackTraceElement.length <= 0) {
/*  93 */       return 0;
/*     */     }
/*     */     
/*  96 */     this.d = new StackTraceElement[arrayOfStackTraceElement.length - 3 - paramInt];
/*  97 */     System.arraycopy(arrayOfStackTraceElement, 3 + paramInt, this.d, 0, this.d.length);
/*  98 */     return this.d.length;
/*     */   }
/*     */   
/*     */   public boolean a(StackTraceElement paramStackTraceElement1, StackTraceElement paramStackTraceElement2) {
/* 102 */     if ((this.d.length == 0) || (paramStackTraceElement1 == null)) { return false;
/*     */     }
/* 104 */     StackTraceElement localStackTraceElement = this.d[0];
/*     */     
/*     */ 
/* 107 */     if ((localStackTraceElement.isNativeMethod() != paramStackTraceElement1.isNativeMethod()) || (!localStackTraceElement.getClassName().equals(paramStackTraceElement1.getClassName())) || (!localStackTraceElement.getFileName().equals(paramStackTraceElement1.getFileName())) || (!localStackTraceElement.getMethodName().equals(paramStackTraceElement1.getMethodName())))
/*     */     {
/*     */ 
/*     */ 
/* 111 */       return false;
/*     */     }
/* 113 */     if ((paramStackTraceElement2 != null ? 1 : 0) != (this.d.length > 1 ? 1 : 0)) return false;
/* 114 */     if ((paramStackTraceElement2 != null) && (!this.d[1].equals(paramStackTraceElement2))) { return false;
/*     */     }
/* 116 */     this.d[0] = paramStackTraceElement1;
/*     */     
/* 118 */     return true;
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/* 122 */     StackTraceElement[] arrayOfStackTraceElement = new StackTraceElement[this.d.length - paramInt];
/* 123 */     System.arraycopy(this.d, 0, arrayOfStackTraceElement, 0, arrayOfStackTraceElement.length);
/* 124 */     this.d = arrayOfStackTraceElement;
/*     */   }
/*     */   
/*     */   public void a(StringBuilder paramStringBuilder) {
/* 128 */     paramStringBuilder.append("-- ").append(this.b).append(" --\n");
/* 129 */     paramStringBuilder.append("Details:");
/*     */     
/* 131 */     for (Object localObject1 = this.c.iterator(); ((Iterator)localObject1).hasNext();) { o localo = (o)((Iterator)localObject1).next();
/* 132 */       paramStringBuilder.append("\n\t");
/* 133 */       paramStringBuilder.append(localo.a());
/* 134 */       paramStringBuilder.append(": ");
/* 135 */       paramStringBuilder.append(localo.b());
/*     */     }
/*     */     
/* 138 */     if ((this.d != null) && (this.d.length > 0)) {
/* 139 */       paramStringBuilder.append("\nStacktrace:");
/*     */       
/* 141 */       for (Object localObject2 : this.d) {
/* 142 */         paramStringBuilder.append("\n\tat ");
/* 143 */         paramStringBuilder.append(((StackTraceElement)localObject2).toString());
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public StackTraceElement[] a() {
/* 149 */     return this.d;
/*     */   }
/*     */   
/*     */   public static void a(k paramk, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4) {
/* 153 */     int i = aji.b(paramaji);
/* 154 */     paramk.a("Block type", new l(i, paramaji));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */     paramk.a("Block data value", new m(paramInt4));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */     paramk.a("Block location", new n(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */