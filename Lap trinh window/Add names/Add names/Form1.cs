using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Add_names
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnAddname_Click(object sender, EventArgs e)
        {
            if (cmbTitle.SelectedIndex == -1)
            {
                MessageBox.Show("Chua chon title");
            }
            else
            {

                lbName.Items.Add(cmbTitle.SelectedItem + txtFirstname.Text + " " + txtLastname.Text);
                txtFirstname.Clear();
                txtLastname.Clear();
            }
        }

        private void txtFirstname_TextChanged(object sender, EventArgs e)
        {
            if(txtFirstname.Text==""||txtLastname.Text=="")
            {
                btnAddname.Enabled = false;
            }
            else
            {
                btnAddname.Enabled = true;
            }
        }

        private void txtLastname_TextChanged(object sender, EventArgs e)
        {
            if (txtLastname.Text == "" || txtLastname.Text == "")
            {
                btnAddname.Enabled = false;
            }
            else
            {
                btnAddname.Enabled = true;
            }
        }

        private void cmbTitle_SelectedIndexChanged(object sender, EventArgs e)
        {
            
        }

        private void btnClose_Click(object sender, EventArgs e)
        {
            DialogResult thongbao;
            thongbao = MessageBox.Show("Ban co muon thoat khong?", "Thong bao", MessageBoxButtons.YesNo, MessageBoxIcon.Question);
            if (thongbao == DialogResult.Yes)
            {
                Application.Exit();
            }
        }
    }
}
